import java.io.*;
import java.util.*;

public class LendoObj {
  public static void main(String[] args) {
    try {

      // Abrindo arquivo para leitura
      FileInputStream arquivo_l = new FileInputStream("alunos.dat");
      ObjectInputStream objIn = new ObjectInputStream(arquivo_l);

      HashMap<String, Aluno> alunos = (HashMap) objIn.readObject();
      objIn.close();

      for (String nomeAluno : alunos.keySet()) {
        System.out.println(nomeAluno);
      }

    } catch (Exception e) {
      System.out.println("Erro " + e);
    }
  }
}