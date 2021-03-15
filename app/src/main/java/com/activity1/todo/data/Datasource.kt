package com.activity1.todo.data

import com.activity1.todo.R
import com.activity1.todo.model.TodoModel

class Datasource {

    fun loadAffirmations(): List<TodoModel> {
        return listOf<TodoModel>(
            TodoModel(R.string.affirmation1),
            TodoModel(R.string.affirmation2),
            TodoModel(R.string.affirmation3),
            TodoModel(R.string.affirmation4),
            TodoModel(R.string.affirmation5),
            TodoModel(R.string.affirmation6),
            TodoModel(R.string.affirmation7),
            TodoModel(R.string.affirmation8),
            TodoModel(R.string.affirmation9),
            TodoModel(R.string.affirmation10)
        )
    }
}