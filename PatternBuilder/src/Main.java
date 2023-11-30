public class Main {

	public static void main (String[] args) {

		// este codigo debe compilar
		/*
		org.sisoftware.builder.Persona madre = new org.sisoftware.builder.Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37)
                .setLugarTrabajo("Google")
                .build();

		org.sisoftware.builder.Persona hijo = new org.sisoftware.builder.Persona.Builder("Pedro")
                .setMenor(4)
                .setColegio("Colegio de Selva")
                .build();
		*/
		// esta codigo NO debe compilar
		/*
		org.sisoftware.builder.Persona mal = new org.sisoftware.builder.Persona.Builder("Luisa")
				    .setMayor(20)
				    .setColegio("Colegio de Villa Arriba")
				    .build();
        */
	}
}
