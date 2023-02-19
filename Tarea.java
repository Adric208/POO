public class Tarea{
    public static void main(String[] args) {
        String a1 = "Ingenieria en computacion",a2= "Dame de baja",a3= "Esto si es ICO";

        System.out.println("\n\nMetodo length()");
        int l = a1.length();
        System.out.println("La longitud de la cadena '" + a1 + "' es: " + l);
    
        
    System.out.println("\n\nMetodo isEmpty()");
        boolean b1 = a1.isEmpty(),b2 = a2.isEmpty();
        System.out.println("La cadena '" + a1 + "' está vacía: " + b1);
        System.out.println("La cadena '" + a2 + "' está vacía: " + b2);
        
        
    System.out.println("\n\nMetodo equals()");
        boolean e1 = a1.equals(a2);
        boolean e2 = a1.equals(a3);
        System.out.println("Las cadenas '" + a1 + "' y '" + a2 + "' son iguales: " + e1);
        System.out.println("Las cadenas '" + a1 + "' y '" + a3 + "' son iguales: " + e2);

        
    System.out.println("\n\nMetodo indexOf()");
        int y = a1.indexOf("en");
        System.out.println("La subcadena 'en' comienza en la posición " + y + " de la cadena '" + a1 + "'");
        
        
    System.out.println("\n\nMetodo lastIndexOf()");
        int x= a1.lastIndexOf("o");
        System.out.println("La última ocurrencia de la letra 'o' en la cadena '" + a1 + "' está en la posición " + x);
        
        
    System.out.println("\n\nMetodo toUpperCase()");
        String u = a1.toUpperCase();
        System.out.println("La cadena '" + a1 + "' en mayúsculas es: " + u);
        
        
    System.out.println("\n\nMetodo toLowerCase()");
        String c = a3.toLowerCase();
        System.out.println("La cadena '" + a3 + "' en minúsculas es: " + c);
        
        
         System.out.println("\n\nMetodo substring() ");
        String n1 = a1.substring(0,25);
        String m2 = a1.substring(14);
        System.out.println("La subcadena de '" + a1 + "' que va desde el inicio hasta la posición 25 es: " + n1);
        System.out.println("La subcadena de '" + a1 + "' que va desde la posición 14 hasta el final es: " + m2);
        
        System.out.println("\n\nPara Integer");
        String p = "3202";
        int k = Integer.parseInt(p);
        System.out.println("El número como entero es: " + k);

        int o = 12451;
        String b = Integer.toString(o);
        System.out.println("El número como texto es: " + b);

        
    }
}
