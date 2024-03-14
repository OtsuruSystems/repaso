import javax.swing.JOptionPane;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres = {"Samuel", "Andres", "Pepe", "Maria", "Paco"};
int count = nombres.length;
        for(int i =0;i<count;i++){
if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("Pepe")){
continue;
}

            System.out.println(i +" - "+nombres[i]);
        }

String buscar = JOptionPane.showInputDialog("Ingrese un nombre por ejemplo \"Samuel\", \"Maria\":");
System.out.println("buscar = "+buscar);
boolean encontrado = false;
for (int i = 0;i<count;i++){
    if(nombres[i].equalsIgnoreCase(buscar)){
        encontrado = true;
        break;
    }
    }
        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar+" Fuen encontrado");
        }else{
             JOptionPane.showMessageDialog(null,buscar+" No encontrado en el sistema");
        }


    }
}
