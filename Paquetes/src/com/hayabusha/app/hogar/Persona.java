package com.hayabusha.app.hogar;

public class Persona {
   private String nombre;
   private  String apeido;
   private ColorPelo colorPelo;

   public static final String GENERO_MASCULINO = "Masculino";
   public static final String GENERO_FEMENINO = "Femenino";


   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApeido() {
      return apeido;
   }

   public void setApeido(String apeido) {
      this.apeido = apeido;
   }

   public ColorPelo getColorPelo() {
      return colorPelo;
   }

   public void setColorPelo(ColorPelo colorPelo) {
      this.colorPelo = colorPelo;
   }

   //METODOS
   public String lanzarPelota(){
      return "lanza la pelota al perro";
   }

   public static String saludar(){
      return "Hola que tal!";
   }

}
