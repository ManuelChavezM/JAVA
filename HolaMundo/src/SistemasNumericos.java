import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");


        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "Número hexadecimal de " + numeroDecimal +" = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
