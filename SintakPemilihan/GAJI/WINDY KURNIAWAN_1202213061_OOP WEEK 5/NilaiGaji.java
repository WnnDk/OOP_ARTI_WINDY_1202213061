

public class NilaiGaji {
  public int cekgolgaji(int gajipokok) {
    switch (gajipokok) {
      case 1:
        return 3000000;
      case 2:
        return 4000000;
      case 3:
        return 5000000;
      case 4:
        return 6000000;
      default:
        return 0;
    }
  }
  public double ceknikah(String menikah){
    if (menikah.equals("y")){
        return 0.2;
    } else if (menikah.equals("t")){
        return 0;
    }
    return 0;
}
public int cekanak(int tunjangananak){
    if (tunjangananak > 3){
        return 3 * 150000;
    } else if (tunjangananak >= 0 & tunjangananak <=3 )
        return tunjangananak * 150000;
    return 0;
    }
}



