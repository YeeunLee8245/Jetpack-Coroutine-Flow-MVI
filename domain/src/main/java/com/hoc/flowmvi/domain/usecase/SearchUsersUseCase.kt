package com.hoc.flowmvi.domain.usecase

import arrow.core.Either
import com.hoc.flowmvi.domain.model.User
import com.hoc.flowmvi.domain.model.UserError
import com.hoc.flowmvi.domain.repository.UserRepository
import javax.inject.Inject

class SearchUsersUseCase @Inject constructor(private val userRepository: UserRepository) {
  suspend operator fun invoke(query: String): Either<UserError, List<User>> =
    userRepository.search(query)
}
