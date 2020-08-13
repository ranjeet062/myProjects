
public class TowerOfHonai {

	public static void main(String[] args) {

		int num =4;
		TowerOfHonai n = new TowerOfHonai();
		n.towerOfH(num, 'A', 'C', 'B');
	}

	public void towerOfH(int n, char start, char end, char aux) {
		if (n == 1) {
			System.out.println("Moving disc 1 from rod " + start + " to rod " + end);
			return;
		}
		towerOfH(n-1, start, aux, end);
		System.out.println("Moving disc "+n+" from rod " + start + " to rod " + end);
		towerOfH(n-1, aux, end,start);

	}

}
