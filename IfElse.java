import javax.swing.JOptionPane;

public class IfElse {
  public static void main(String[] args){
    int numPeople = Integer.parseInt(JOptionPane.showInputDialog("Enter number of people "));
    int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter number of player "));
    int groupSize, teamSize;
    
    if(numPeople>10)
    {groupSize = numPeople/2;
        System.out.println("The groupSize is " + groupSize);
    } else if (numPeople<=10&&numPeople>=3){
       groupSize=numPeople/3;
       System.out.println("the groupSize is " + groupSize);
    }
    else{
       System.out.println(" The number of people has to be at least 3");
       }
       if(numPlayers>=11&&numPlayers<=55){
         teamSize= numPlayers/11;
	 System.out.println("The teamsize is " + teamSize);
	 } else{
	 teamSize=1;
	 System.out.println("The teamsize is " + teamSize);
	}
 }
}

