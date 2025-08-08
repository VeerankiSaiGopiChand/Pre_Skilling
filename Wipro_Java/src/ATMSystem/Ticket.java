package ATMSystem;


class TicketBooking
{
	int availableSeats=1;
public synchronized void bookTicket(String name)
{
	if(availableSeats>0)
	{
		System.out.println(name + " is booking ticket...");
		try {
			Thread.sleep(0000);
		    }
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	System.out.println(name +" successfully booked the ticket!");
	availableSeats--;
	}
	else
	{
	System.out.println(" sorry "+ name +" , seat already booked!");
 
	}
	}
	}
class User2 extends Thread
{
	TicketBooking booking;
	String userName;
	public User2 (TicketBooking booking, String userName)
	{
		this.booking=booking;
		this.userName=userName;
	}
	public void run()
	{
		booking.bookTicket(userName);
	}
}
 
public class Ticket {
 
	public static void main(String[] args)
	{
		TicketBooking booking=new TicketBooking();
		
		User2 user1=new User2(booking,"Renu");
		User2 user2=new User2(booking,"Sai");
		User2 user3=new User2(booking,"Mahasa");
        user1.start();
        user2.start();
        user3.start();
        
	}
 
}
 
 