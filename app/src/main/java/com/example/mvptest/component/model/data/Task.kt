package com.example.mvptest.component.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.common.base.Objects
import com.google.common.base.Strings
import java.util.*


/**
 * Immutable model class for a Task.
 */
@Entity(tableName = "tasks")
data class Task
/**
 * Use this constructor to specify a completed Task if the Task already has an id (copy of
 * another Task).
 *
 * @param title       title of the task
 * @param description description of the task
 * @param id          id of the task
 * @param completed   true if the task is completed, false if it's active
 */
    (
    @field:ColumnInfo(name = "title")
    val title: String?, @field:ColumnInfo(name = "description")
    val description: String?,
    @field:PrimaryKey
    @field:ColumnInfo(name = "entryid")
    val id: String, @field:ColumnInfo(name = "completed")
    val isCompleted: Boolean
) {

    val titleForList: String?
        get() = if (!Strings.isNullOrEmpty(title)) {
            title
        } else {
            description
        }

    val isActive: Boolean
        get() = !isCompleted

    val isEmpty: Boolean
        get() = Strings.isNullOrEmpty(title) && Strings.isNullOrEmpty(description)

    /**
     * Use this constructor to create a new active Task.
     *
     * @param title       title of the task
     * @param description description of the task
     */
    @Ignore
    constructor(title: String?, description: String?) : this(title, description, UUID.randomUUID().toString(), false)

    /**
     * Use this constructor to create an active Task if the Task already has an id (copy of another
     * Task).
     *
     * @param title       title of the task
     * @param description description of the task
     * @param id          id of the task
     */
    @Ignore
    constructor(title: String?, description: String?, id: String) : this(title, description, id, false)
    /**
     * Use this constructor to create a new completed Task.
     *
     * @param title       title of the task
     * @param description description of the task
     * @param completed   true if the task is completed, false if it's active
     */
    @Ignore
    constructor(title: String?, description: String?, completed: Boolean) : this(
        title,
        description,
        UUID.randomUUID().toString(),
        completed
    )

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val task = o as Task?
        return Objects.equal(id, task!!.id) &&
                Objects.equal(title, task.title) &&
                Objects.equal(description, task.description)
    }

    override fun hashCode(): Int {
        return Objects.hashCode(id, title, description)
    }

    override fun toString(): String {
        return "Task with title " + title!!
    }
}
