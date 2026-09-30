package com.ihajar.notes_app.database.repository

import com.ihajar.notes_app.database.model.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, ObjectId> {
    fun findByEmail(emai: String): User?
}