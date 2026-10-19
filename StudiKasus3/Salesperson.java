public class Salesperson implements Comparable
{
   private String firstName, lastName;
   private int totalSales;

   public Salesperson (String first, String last, int sales)
   {
      firstName = first;
      lastName = last;
      totalSales = sales;
   }

   public String toString()
   {
      return lastName + ", " + firstName + ": \t" + totalSales;
   }

   public boolean equals (Object other)
   {
      return (lastName.equals(((Salesperson) other).getLastName()) &&
              firstName.equals(((Salesperson) other).getFirstName()));
   }

   public int compareTo (Object other)
   {
      Salesperson otherPerson = (Salesperson) other;
      
      if (this.totalSales != otherPerson.getSales())
      {
         return this.totalSales - otherPerson.getSales();
      }

      int lastCompare = this.lastName.compareTo(otherPerson.getLastName());
      if (lastCompare != 0)
      {
         return lastCompare;
      }

      return this.firstName.compareTo(otherPerson.getFirstName());
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getSales()
   {
      return totalSales;
   }
}