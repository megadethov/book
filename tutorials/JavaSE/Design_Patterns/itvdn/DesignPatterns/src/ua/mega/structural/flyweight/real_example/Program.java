package ua.mega.structural.flyweight.real_example;

public class Program {
    public static void main(String[] args) {
        ActorMikeMyers mikeMyers = new ActorMikeMyers();

        RoleAustinPowers austinPowers = new RoleAustinPowers(mikeMyers);
        RoleDoctorEvil doctorEvil = new RoleDoctorEvil(mikeMyers);

        austinPowers.greeting("Austin speech");
        doctorEvil.greeting("Doctor speech");
    }
}
