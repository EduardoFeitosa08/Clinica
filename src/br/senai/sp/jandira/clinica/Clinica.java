/*
 * Programador: Eduardo
 * Empresa: Senai
 * Data: 19-02-2025
 */


package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criação dos objetos do tipo paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		p1.setPeso(68.200);
		p1.setAltura(1.65);
		p1.telefone = "(11)96666-6666";
		p1.estaInternado = true;
		
		
		Paciente p2 = new Paciente();
		p2.nome = "Mc Lovin";
		p2.dataNascimento = LocalDate.of(1989, 6, 20);
		p2.setPeso(68);
		p2.setAltura(1.77);
		p2.telefone = "(11)98888-8888";
		p2.estaInternado = false;
		
		//Mostrar dados do Paciente
		p1.mostrarFichaPaciente();
		p2.mostrarFichaPaciente();


	}

}
