package com.teach;

public class Main {

	public static boolean isDiverse(int arr2d[][]) {
		int result[] = rowSums(arr2d);
		printRow(result);
		for (int i = 0; i < result.length; i++) {
			for (int j = i+1; j < result.length; j++) {
				if (result[i] == result[j])
					return false;
			}
		}
		return true;
	}

	public static int arraySum(int[] arr1) {
		int rv = 0;
		for (int i = 0; i < arr1.length; i++) {
			rv += arr1[i];
		}
		return rv;
	}

	public static int[] rowSums(int arr2D[][]) {
		int [] rv = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			rv[i] = arraySum(arr2D[i]);
		}
		return rv;
	}

	public static void solveExamProblem() {
		int arr1[] = {1, 3, 2, 7, 3};
		System.out.println(arraySum(arr1));
		int arr2D[][] = {
				{1, 3, 2, 7, 3},
				{10, 10, 4, 6, 2},
				{5, 3, 5, 9, 6},
				{7, 6, 4, 2, 1}
		};
		int result[] = rowSums(arr2D);
		printRow(result);
		if (isDiverse(arr2D)) {
			System.out.println("Array is diverse");
		} else {
			System.out.println("Array is NOT diverse");
		}

		int mat2[][] = {
				{1, 1, 5, 3, 4},
				{12, 7, 6, 1, 9},
				{8, 11, 10, 2, 5},
				{3, 2, 3, 0, 6}
		};
		if (isDiverse(mat2)) {
			System.out.println("Array is diverse");
		} else {
			System.out.println("Array is NOT diverse");
		}

	}

	public static void printRow(int b[]) {
		System.out.print("|");
		for (int i = 0; i < b.length; i++) {
			System.out.print(String.format("%4d |", b[i]));
		}
		System.out.println("");
	}
	public static void printArray(int b[][]) {
		for (int i = 0; i < b.length; i++) {
			printRow(b[i]);
		}
	}
    public static void main(String[] args) {
		if (false) {
			int a[] = new int[10];
			System.out.println(a.length);

			int b[][] = new int[10][10];
			System.out.println("Dimensions are " + b.length + "x" + b[0].length);
			for (int row = 0; row < b.length; row++) {
				for (int col = 0; col < b[row].length; col++) {
					b[row][col] = (row + 1) * (col + 1);
				}
			}
			printArray(b);
		}
		if (false)
		    solveExamProblem();

		Person p = new Person("Shivani", "Shimpi");
		System.out.println(p);
		Person[][] people = new Person[2][4];
		people[0][0] = new Person("Shashank", "Shimpi");
		people[0][1] = new Person("Deepali", "Shimpi");
		people[0][2] = p;
		people[0][3] = new Person("Shivam", "Shimpi");

		people[1][0] = new Person("Prasad", "Gharpure");
		people[1][1] = new Person("Geeta", "Agashe");
		people[1][2] = new Person("Akshay", "Gharpure");
		people[1][3] = new Person("Shreeya", people[1][0].getLastname());

		for (int family=0; family < people.length; family ++) {
            System.out.println("The " + people[family][0].getLastname() + " Family");
            System.out.println("--------------------------------------");
		    for (int i = 0; i < people[family].length; i++) {
                System.out.println("\t" + people[family][i].toString());
            }
            System.out.println("--------------------------------------\n");
        }

    }
}
