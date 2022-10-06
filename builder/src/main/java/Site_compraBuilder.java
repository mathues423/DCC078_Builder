public class Site_compraBuilder {
    private Site_compra usuario;
    public Site_compraBuilder(){
        usuario = new Site_compra();
    }

    public Site_compra construtor(){
        if(usuario.getName().equals("")){
            throw new IllegalArgumentException("Nome inválido.");
        }

        if(!usuario.getEmail().contains("@")){
            throw new IllegalArgumentException("E-mail inválido.");
        }
        if(String.valueOf(usuario.getCpf()).length() != 9){
            throw new IllegalArgumentException("Tamanho de CPF inválido.");
        }

        return usuario;
    }

    public Site_compraBuilder setName(String name) {
        usuario.setName(name);
        return this;
    }

    public Site_compraBuilder setMid_name(String mid_name) {
        usuario.setMid_name(mid_name);
        return this;
    }

    public Site_compraBuilder setLast_name(String last_name) {
        usuario.setLast_name(last_name);
        return this;
    }

    public Site_compraBuilder setCpf(String cpf) {
        usuario.setCpf(cpf);
        return this;
    }

    public Site_compraBuilder setBairo(String bairo) {
        usuario.setBairo(bairo);
        return this;
    }

    public Site_compraBuilder setRua(String rua) {
        usuario.setRua(rua);
        return this;
    }

   public Site_compraBuilder setComplemento(String complemento) {
        usuario.setComplemento(complemento);
        return this;
    }

   public Site_compraBuilder setNumero(int numero) {
        usuario.setNumero(numero);
        return this;
    }

    public Site_compraBuilder setCep(String cep) {
        usuario.setCep(cep);
        return this;
    }

    public Site_compraBuilder setEmail(String email) {
        usuario.setEmail(email);
        return this;
    }

    public Site_compraBuilder setCel(int cel) {
        usuario.setCel(cel);
        return this;
    }
}