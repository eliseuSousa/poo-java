import java.util.HashMap;
import java.io.*;

public class Principal {
  public static void main(String[] args) {
    // Objeto para a leitura de arquivos
    FileInputStream file_l;

    // Objeto para gravação de arquivos
    FileOutputStream file_g;

    // Objeto para a leitura de objetos
    ObjectInputStream objIn;

    // Objeto para a gravação de objetos
    ObjectOutputStream objOut;

    // Objeto HashMap para guardar dados dos alunos
    HashMap<String, Aluno> alunos = new HashMap<>();

    // Objetos para entreda de dados
    InputStreamReader inRS;
    BufferedReader input;

    try {
      alunos = null;
      file_l = new FileInputStream("alunos.dat");
      objIn = new ObjectInputStream(file_l);

      alunos = (HashMap<String, Aluno>) objIn.readObject();
      objIn.close();

      for (Aluno a : alunos.values()) {
        System.out.println("Nota prova 1: " + a.getNotaProva1());
        System.out.println("Nota prova 2: " + a.getNotaProva2());
        System.out.println("Nota trabalho: " + a.getNotaTrabalho());
        System.out.println("Média: " + a.media());
        System.out.println("Preicisa tirar na prova final: " + a.avaliacaoFinal());
      }

    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }
  }
}