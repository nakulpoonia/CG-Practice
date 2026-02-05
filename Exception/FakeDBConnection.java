package Exception;

class FakeDBConnection implements AutoCloseable {
    private boolean open = false;

    public void connect() {
        open = true;
        System.out.println("DB Connected");
    }

    public void executeQuery(String query) {
        if (!open) throw new IllegalStateException("DB is not connected");
        System.out.println("Executing: " + query);
    }

    
    public void close() {
        if (open) {
            System.out.println("Closing DB Connection");
            open = false;
        }
    }
}

class FakeTransaction implements AutoCloseable {
    private boolean active = false;
    private boolean committed = false;

    public void begin() {
        active = true;
        System.out.println("Transaction Started");
    }

    public void commit() {
        if (!active) throw new IllegalStateException("No active transaction");
        committed = true;
        System.out.println("Transaction Committed");
    }

    public void rollback() {
        if (active && !committed) {
            System.out.println("Transaction Rolled Back");
        }
    }


    public void close() {

        if (active && !committed) {
            rollback();
        }
        System.out.println("Transaction Closed");
        active = false;
    }
}

class Main {
    public static void main(String[] args) {


        try (FakeDBConnection db = new FakeDBConnection();
             FakeTransaction tx = new FakeTransaction()) {

            db.connect();
            tx.begin();

            db.executeQuery("INSERT INTO users VALUES ('Nakul')");
            db.executeQuery("UPDATE users SET name='Poonia'");


            if (true) throw new RuntimeException("Something went wrong!");



        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

