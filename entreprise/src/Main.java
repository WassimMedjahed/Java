import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Company> companies = new ArrayList();


        Company oranges = new Company();
        oranges.libelle = "Oranges";
        oranges.address = new Address("44300", "Nantes");

        oranges.employees.add(new Employee("Grieeman", "Natacha", 32));
        oranges.employees.add(new Employee("Dupont", "Jean-Luc", 37));

        companies.add(oranges);



        Company gogo = new Company();
        gogo.libelle = "GoGoDev";
        gogo.address = new Address("29820", "Bohars");

        gogo.employees.add(new Employee("Brechet", "Stephane", 29));

        companies.add(gogo);




        Company next = new Company();
        next.libelle = "NextDigital";
        next.address = new Address("29770","Cléden Cap Sizun");

        next.employees.add(new Employee("Lemoine", "Sacha", 24));
        next.employees.add(new Employee("Esteban", "Durand", 31));
        next.employees.add(new Employee("Mélanie", "Laporte", 34));

        companies.add(next);



        for (Company company : companies) {
            System.out.println(String.format("%s (%s - %s),%d salarié(e)s", company.libelle,company.address.cp,company.address.city,company.employees.size()));
        }
    }
}