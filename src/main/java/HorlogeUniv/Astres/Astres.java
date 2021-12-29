package HorlogeUniv.Astres;


public abstract class Astres {
    private float dureeRevolutionJours;

    public Astres(float dureeRevolutionJours) {
        this.dureeRevolutionJours = dureeRevolutionJours;
    }

    public float getDureeRevolutionJours() {
        return dureeRevolutionJours;
    }

    public void drawSphere(double drawX, double drawY, double sphereRadius) {
    }

    public void drawOrbitingSphere(int timeInterval) {

        // let's just choose a bunch of values that we'll need
        double orbitX = 0.5; /* x-coordinate in orbit's center */
        double orbitY = 0.55; /* y-coordinate in orbit's center */
        double orbitRadius = 0.02;
        double orbitSpeed = Math.PI / 16; // A Finir
        double sphereRadius = 0.05;

        /*
         * based on the current time interval, we'll calculate where the sphere
         * is at on its orbit
         */
        double radian = orbitSpeed * timeInterval;
        double drawX = orbitX + orbitRadius * Math.cos(radian);
        double drawY = orbitY + orbitRadius * Math.sin(radian);

        // use whichever Draw method is provided by your API
        drawSphere(drawX, drawY, sphereRadius);
    }


}