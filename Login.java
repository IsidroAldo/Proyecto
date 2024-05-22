class Login{ //CREAMOS NUESTRA CLASE "LOGIN"
    //CREAMOS Y DAMOS ATRIBUTOS
    private String USUARIO = "OSCAR", CONTRASEÑA = "holaquehace";//CON MAYUSCULAS SABEMOS QUE ES UNA "CONSTANTE"
    private String usuario, contraseña;

    //CREAMOS UN CONSTRUCTOR
    public void inicio(String USUARIO, String CONTRASEÑA){
        USUARIO = this.usuario;
        CONTRASEÑA = this.contraseña;
    }

    //CREAMOS NUESTRA FUNCION "LOGIN" PARA QUE NOS DE ACCESO
    public void login(){
        System.out.println("\n¡BIENVENIDO!");
        System.out.println("USTED A ACCEDIDO");
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String uSUARIO) {
        USUARIO = uSUARIO;
    }

    public String getCONTRASEÑA() {
        return CONTRASEÑA;
    }

    public void setCONTRASEÑA(String cONTRASEÑA) {
        CONTRASEÑA = cONTRASEÑA;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Login [USUARIO=" + USUARIO + ", CONTRASEÑA=" + CONTRASEÑA + ", usuario=" + usuario + ", contraseña="
                + contraseña + "]";
    }

}