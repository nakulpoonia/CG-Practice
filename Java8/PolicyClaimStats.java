package Java8;

import java.util.*;
import java.util.stream.Collectors;

 class Main1 {


    static class Claim {
        private final int claimId;
        private final String policyNumber;
        private final double claimAmount;
        private final String claimDate;   // kept String for simplicity
        private final String status;

        public Claim(int claimId, String policyNumber, double claimAmount, String claimDate, String status) {
            this.claimId = claimId;
            this.policyNumber = policyNumber;
            this.claimAmount = claimAmount;
            this.claimDate = claimDate;
            this.status = status;
        }

        public int getClaimId() { return claimId; }
        public String getPolicyNumber() { return policyNumber; }
        public double getClaimAmount() { return claimAmount; }
        public String getClaimDate() { return claimDate; }
        public String getStatus() { return status; }
    }


    static class PolicyClaimStats {
        private final String policyNumber;
        private final double totalAmount;
        private final double averageAmount;

        public PolicyClaimStats(String policyNumber, double totalAmount, double averageAmount) {
            this.policyNumber = policyNumber;
            this.totalAmount = totalAmount;
            this.averageAmount = averageAmount;
        }

        public String getPolicyNumber() { return policyNumber; }
        public double getTotalAmount() { return totalAmount; }
        public double getAverageAmount() { return averageAmount; }


        public String toString() {
            return "Policy=" + policyNumber +
                    ", total=" + totalAmount +
                    ", avg=" + averageAmount;
        }
    }


    public static List<PolicyClaimStats> top3PoliciesByTotalClaims(List<Claim> claims) {


        List<Claim> filtered = claims.stream()
                .filter(c -> "Approved".equalsIgnoreCase(c.getStatus()))
                .filter(c -> c.getClaimAmount() > 5000)
                .collect(Collectors.toList());


        Map<String, List<Claim>> groupedByPolicy = filtered.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber));


        List<PolicyClaimStats> policyStats = groupedByPolicy.entrySet().stream()
                .map(entry -> {
                    String policy = entry.getKey();
                    List<Claim> policyClaims = entry.getValue();

                    double total = policyClaims.stream()
                            .mapToDouble(Claim::getClaimAmount)
                            .sum();

                    double avg = policyClaims.stream()
                            .mapToDouble(Claim::getClaimAmount)
                            .average()
                            .orElse(0.0);

                    return new PolicyClaimStats(policy, total, avg);
                })
                .collect(Collectors.toList());


        return policyStats.stream()
                .sorted(Comparator.comparingDouble(PolicyClaimStats::getTotalAmount).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim(1, "POL1001", 6000, "2025-01-10", "Approved"),
                new Claim(2, "POL1001", 12000, "2025-02-05", "Approved"),
                new Claim(3, "POL1002", 4000, "2025-01-20", "Approved"),
                new Claim(4, "POL1002", 9000, "2025-02-12", "Approved"),
                new Claim(5, "POL1003", 15000, "2025-02-15", "Rejected")

        );

        List<PolicyClaimStats> top3 = top3PoliciesByTotalClaims(claims);

        System.out.println("Top 3 Policies by Total Approved Claims > 5000:");
        top3.forEach(System.out::println);
    }
}
