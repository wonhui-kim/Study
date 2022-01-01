📲 Notification(알림) 동작 방식

- 개요
  앱 내부가 아닌 외부 영역에 표시할 수 있는 아이콘 및 메시지
- 동작 방식
  1. NotificationCompat.Builder를 사용하여 필수 표시 요소인 작은 아이콘, 선택 표시 요소인 제목, 세부 설정 등 표시하고자 하는 알림을 커스텀한다.
  2. Android 8.0 (API level 26) 이상에서는 알림 관리를 위해 Notification Channel 에 등록한다.
  3. 앱 내부가 아닌 외부에 표시해야하므로 PendingIntent에 담아 NotificationManager에 Noti를 등록한다.
  4. NotificationManager는 전달 받은 알림을 실행한다.
