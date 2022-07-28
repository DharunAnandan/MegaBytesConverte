public class MegaBytesConverter {

    public static int printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes<0) {
            return -1;
        }

        else if(kiloBytes>0) {

            int MegaBytes = kiloBytes / 1024;
            int RemainingKiloBytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB" + "=" + MegaBytes + " MB and " + RemainingKiloBytes + " KB");
        }
      return kiloBytes / 1024;
    }
}
