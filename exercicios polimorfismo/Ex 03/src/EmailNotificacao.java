class EmailNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Notificação enviada por Email: " + mensagem);
    }
}
