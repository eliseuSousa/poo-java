package questao2;

public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int d, int m, int a) {
    if ((d > 31 && d <= 0) || (m > 12 && m < 0) || (a > 2999 && a < 0)) {
      this.dia = 01;
      this.mes = 01;
      this.ano = 01;
    } else {
      this.dia = d;
      this.mes = m;
      this.ano = a;
    }
  }

  public int comparar(Data dataP) {
    if ((this.dia == dataP.getDia()) && (this.mes == dataP.getMes()) && (this.ano == dataP.getAno())) {
      return 0;
    } else if (this.ano > dataP.getAno()) {
      return 1;
    } else if (this.mes > dataP.getMes()) {
      return 1;
    } else if (this.dia > dataP.getDia()) {
      return 1;
    } else {
      return -1;
    }
  }

  public Data clone() {
    Data dataClone = new Data(this.dia, this.mes, this.ano);
    return dataClone;
  }

  public String toString() {
    return this.dia + "/" + this.mes + "/" + this.ano;
  }

  public int getDia() {
    return this.dia;
  }

  public int getMes() {
    return this.mes;
  }

  public int getAno() {
    return this.ano;
  }

}