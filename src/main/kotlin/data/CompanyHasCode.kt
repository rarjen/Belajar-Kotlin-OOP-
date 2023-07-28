package data

class CompanyHasCode(val name: String) {

    override fun hashCode(): Int {
        return this.name.hashCode();
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> other.name == this.name;
            else -> false;
        }
    }
}