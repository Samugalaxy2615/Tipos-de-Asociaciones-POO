public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Central");
        uni.agregarDepartamento("Ingeniería");
        uni.agregarDepartamento("Ciencias");

        Departamento ing = uni.getDepartamentos().get(0);
        Departamento cie = uni.getDepartamentos().get(1);

        Profesor profAna = new Profesor("Ana");
        Profesor profLuis = new Profesor("Luis");

        ing.contratarProfesor(profAna);
        cie.contratarProfesor(profLuis);
        cie.contratarProfesor(profAna);

        Curso prog = new Curso("Programación");
        Curso mate = new Curso("Matemáticas");

        prog.asignarProfesor(profAna);
        mate.asignarProfesor(profLuis);

        Estudiante est1 = new Estudiante("Carlos", "E001");
        Estudiante est2 = new Estudiante("María", "E002");

        prog.inscribirEstudiante(est1);
        prog.inscribirEstudiante(est2);
        mate.inscribirEstudiante(est1);

        ing.ofrecerCurso(prog);
        cie.ofrecerCurso(mate);

        prog.generarReporte();
        mate.generarReporte();
    }
}