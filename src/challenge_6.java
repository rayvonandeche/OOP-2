public class challenge_6 {
    public interface DataSource {
        public void execute();
    }

    abstract public class Account {
        protected int id;
        protected String name;
        private DataSource myData;

        public void perfomOperation(DataSource _myData) {
            myData = _myData;
            myData.execute();
        }
    }

    public class Admin extends Account {
        private String authPassword;

        public Admin(int _id, String _name, String _password) {
            id = _id;
            name = _name;
            authPassword = _password;
        }

    }

    public class Delete implements DataSource {
        @Override
        public void execute() {
            System.out.println("Data has been deleted");
        }
    }
    public class Update implements DataSource{

        @Override

        public void execute() {

            System.out.println("Data has been Updated Successfuly!");

        }

    }


    public class User extends Account {

        public User(int _id, String _name){

            id = _id;

            name = _name;

        }

    }


    public class View implements DataSource {

        @Override

        public void execute() {

            System.out.println("Some data to be displayed.");

        }

    }


    public class MainApplication {
        public static void main(String[] args) {
            Admin curAdmin = new challenge_6().new Admin(190159, "Andeche", "12345678");
            User curUser = new challenge_6().new User(190159, "Andeche");
            curAdmin.perfomOperation(new challenge_6().new Update());
            curUser.perfomOperation(new challenge_6().new View());
        }
    }
}
