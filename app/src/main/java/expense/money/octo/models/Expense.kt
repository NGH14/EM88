package expense.money.octo.models

import expense.money.octo.utils.getCurrentDateString

data class Expense(
	var id: Long = -1,
	var type: ExpenseType = ExpenseType.TRAVEL,
	var dateSpent: String? = null,
	var createdDate: String? = getCurrentDateString(withTime = false),
	var comment: String? = null,
	var amount: Int = 0,
	var tripId: Long = -1,
) : java.io.Serializable