class Pessoa {
    var nome: String
    var idade: String
    var profissao: String
    var ativo:Long = 1

    constructor(nome: String, idade: String, profissao: String) {
        this.nome = nome
        this.idade = idade
        this.profissao = profissao
    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade='$idade', profissao='$profissao', ativo=$ativo)"
    }


}