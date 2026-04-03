public class Matriz5x5 {
	public static void main (String[] args){
		int [] [] _matriz5x5;
		_matriz5x5 = new int [5][5];

		for(int _l=0; _l<5; _l++) {
			for(int _i=0; _i<5; _i++) {
				_matriz5x5[_l][_l] = (_l * _i);
				System.out.print(_matriz5x5[_l][_l] + "	");
			}
			System.out.println("");
		}
	}
}