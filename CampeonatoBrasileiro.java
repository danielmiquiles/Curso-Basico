import java.util.Scanner;

public class CampeonatoBrasileiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] times, times2;
		int qtdTimes;

		System.out.println(" Informar quantidades de times: ");
		qtdTimes = sc.nextInt();

		times = new String[qtdTimes];
		times2 = new String[qtdTimes];
		for (int i = 0; i < qtdTimes; i++) {
			System.out.println("Informe o nome do Time: " + i + "--->");
			times[i] = sc.next();
			times2[i] = times[i];
			
		}
		for (int i = 0; i < qtdTimes; i++) {
			System.out.println(" Time " + i + "-->" + times[i]);
		}
		for (int i = 0; i <qtdTimes; i++) {
			System.out.println(" Time " + i + "-->" + times2[i]);
		}
		for (int i = 0; i < qtdTimes; i++) {
			for (int j = 0; j <qtdTimes; j++) {
				if(!times[i].equals(times2[j])){
					System.out.println(times[i] + " X " + times2[j]);
					
				}
				
			}
			
		}

		}
	}

