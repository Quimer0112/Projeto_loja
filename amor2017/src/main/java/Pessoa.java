
import java.io.File;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Pessoa {

    /**
     * @return the codPessoa
     */
    public int getCodPessoa() {
        return codPessoa;
    }

    /**
     * @param codPessoa the codPessoa to set
     */
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.Nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return CPF;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.CPF = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return RG;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.RG = RG;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.Email = email;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return DataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.DataNascimento = dataNascimento;
    }

    /**
     * @return the foto
     */
    public File getFoto() {
        return Foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(File foto) {
        this.Foto = foto;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the endereco to set
     */
    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Celular
     */
    public Telefone getCelular() {
        return Celular;
    }

    /**
     * @param Celular the celular to set
     */
    public void setCelular(Telefone celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Fixo
     */
    public Telefone getFixo() {
        return Fixo;
    }

    /**
     * @param Fixo the fixo to set
     */
    public void setFixo(Telefone Fixo) {
        this.fixo = Fixo;
    }

    public Pessoa() {
    
    }
    private int codPessoa;
    private String Nome;
    private int CPF;
    private int RG;
    private String OrgaoExpedidor;
    private String Email;
    private Date DataNascimento;
    private File Foto;
    private String Endereco;
    private int Celular;
    private int Fixo;  

