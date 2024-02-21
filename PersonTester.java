import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
/**
Test class for Comparable Person objects.
 */
public class PersonTester
{
    public static void main(String [] args)
    {
        ArrayList<Person> people = new ArrayList<Person>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter 10 names and ages: ");
        for (int i = 0; i < 10; i++)
        {
            name = scanner.next();
            age = scanner.nextInt();
            people.add(new Person(name, age));
            scanner.nextLine();
        }

        Person firstPerson = people.get(0);
        Person lastPerson = people.get(people.size()-1);
        
        for(Person person : people)
        {
            if(person.compareTo(firstPerson) < 0)
            {
                firstPerson = person;
            }
            
            if(person.compareTo(lastPerson) > 0)
            {
                lastPerson = person;
            }
        }

        System.out.println( "First: " + firstPerson );
        System.out.println( "Last: " + lastPerson );
        
        
        Collections.sort(people);
        System.out.println("\nAll people:");
        for(Person person : people)
        {
            System.out.println(person);
        }
    }
}
