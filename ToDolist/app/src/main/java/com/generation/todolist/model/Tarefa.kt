package com.generation.todolist.model

data class Tarefa (
    val id: Long,
    val nome: String,
    val descricao: String,
    val responsavel: String,
    val data: String,
    var status: Boolean,
    val categoria: Categoria
        ){
}