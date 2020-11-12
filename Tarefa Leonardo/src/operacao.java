import java.io.IOException;
import java.util.Scanner;

public class operacao {
	
	static double n1;
	static double n2;
	static double m;
	static int freq;
	static String status;
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void calcularMedia() throws IOException {
		Scanner strInput = new Scanner(System.in);
		
		System.out.println("Programa 0.1 de calculo de media e aprovação de aluno");
		System.out.println();
		System.out.println("Digite a frequencia do aluno: ");
		freq = strInput.nextInt();
		System.out.println("Digite a nota N1 do aluno: ");
		n1 = strInput.nextDouble();
		System.out.println("Digite a nota N2 do aluno: ");
		n2 = strInput.nextDouble();
		
		if (freq < 0 || freq > 45) {
			System.out.println("Frequencia invalida");
		} else {
			System.out.println("frequencia valida");
		}
		if (n1 < 0 || n1 > 10) {
			System.out.println("nota N1 Invalida");
		}else {
			System.out.println("nota N1 Valida");
		}
		if (n2 < 0 || n2 > 10) {
			System.out.println("nota N2 Invalida");
		}else {
			System.out.println("nota N2 Valida");
		}
		if (n1 > 0 && n1 <= 10 && n2 > 0 && n2 <= 10){
			m = (0.4 * n1) + (0.6 * n2);
			System.out.println(m);
		}else {
			System.out.println("media invalida");
		}
		if (freq < 15) {
			status = "RF";
			System.out.println("Reprovado por falta");
		}else if (m < 6.0) {
			status = "RM";
			System.out.println("Reprovado por media");
		}else {
			status = "AP";
			System.out.println("Aluno Aprovado");
		}
		
	}
}
