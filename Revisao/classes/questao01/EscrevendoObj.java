import java.io.*;
import java.util.*;

public class EscrevendoObj {
  public static void main(String[] args) {
    try {
      HashMap<String, Aluno> alunos = new HashMap<>();

      alunos.put("Pedro", new Aluno(5, 5, 7));
      alunos.put("Marcos", new Aluno(6, 6, 9));

      // Abrindo arquivo para escrita
      FileOutputStream arquivo_g = new FileOutputStream("alunos.dat");
      ObjectOutputStream objOut = new ObjectOutputStream(arquivo_g);
      objOut.writeObject(alunos);
      objOut.close();

      // Abringo arquivo para leitura
      alunos = null;
      FileInputStream file_l = new FileInputStream("alunos.dat");
      ObjectInputStream objIn = new ObjectInputStream(file_l);
      alunos = (HashMap) objIn.readObject();
      objIn.close();

      for (String nome : alunos.keySet()) {
        System.out.println(nome);
      }
    } catch (Exception e) {
      System.out.println("Erro" + e);
    }
  }
}