object Tsk {
  implicit class ToTsk(s: String) {
    def tsk = s.replaceAll("[aeıoöuü]", "i").replaceAll("[AEIOÖUÜ]", "İ")
  }
}