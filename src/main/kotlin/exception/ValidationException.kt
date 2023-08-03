package exception

// Disarankan membuat sendiri custom exception

class ValidationException(message: String) : Throwable(message);