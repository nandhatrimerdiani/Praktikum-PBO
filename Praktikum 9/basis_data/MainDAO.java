public class MainDAO {
    public static void main(String args[]){
        person person = new person ("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        } catch (Exception e){
            e.printStackTrace();
        }
        }
    }
    

