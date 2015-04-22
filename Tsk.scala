object Tsk {
  implicit class ToTsk(s: String) {
    def tsk = s.replaceAll("[eıüö]", "i").replaceAll("[EIÜÖ]", "İ")
  }
}