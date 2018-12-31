package com.takusemba.jethub.util

import com.takusemba.jethub.model.SimpleDeveloper

fun createSimpleDeveloper(
  id: Int = -1,
  login: String = "",
  avatarUrl: String = ""
) = SimpleDeveloper(
  id = id,
  login = login,
  avatarUrl = avatarUrl
)