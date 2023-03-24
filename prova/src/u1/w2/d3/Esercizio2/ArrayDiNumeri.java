package u1.w2.d3.Esercizio2;


public class ArrayDiNumeri implements Runnable{
private static int tot = 0;
private static int arr[]= new int [1000];
private int num;

//metodo
private int getNum() {
	this.num = (int) Math.random()*10;
	return num;
}


public  int getSommaArray() {
	
	for(int i=0; i<1000; i++) {
	
	arr[i] = getNum();
	tot = tot + arr[i];
	System.out.println(arr[i]);
	}
	return tot;
}

public void run() {
	getSommaArray();	
	}
	
}



