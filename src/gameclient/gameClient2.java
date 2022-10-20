/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameclient;

/**
 *
 * @author NMHAI
 */
class gameClient2 
{
	public static void main(String args[]) throws Exception
	{
		int port = 1234;
               // if(args.length < 2)
		//{
		//	System.err.println("Error: Please a server name or address and a port number");
		//	System.exit(1);
		//}
		//try
		//{
		//	port = Integer.parseInt(args[1]);
		//}
		//catch(NumberFormatException e)
		//{
		//	System.err.println("Error: Argument could not be parsed into an integer, please include port number as second argument");
		//	System.exit(1);
		//}
		ClientGame game = new ClientGame("localhost", port);
		game.start();
	}

}

