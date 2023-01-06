package entities;

public class Room {
	private String client;
	private String email_client;
	private int number;
	
	public Room(String nome, String email, int room) {
		this.client = nome;
		this.email_client = email;
		this.number = room;
	}
	
	public String getNome() {
		return client;
	}
	public void setNome(String nome) {
		this.client = nome;
	}
	public String getEmail() {
		return email_client;
	}
	public void setEmail(String email) {
		this.email_client = email;
	}
	public int getRoom() {
		return number;
	}
	public void setRoom(int room) {
		this.number = room;
	}
	
	public String toString() {
		return String.format("%s: %s, %s", number, client, email_client);
	}
	
	public static void toStringNonNull(Room room) {
		if (room != null) System.out.println(room);
	}
}
