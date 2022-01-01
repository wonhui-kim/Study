⏰ Alarm

-알람 실행 유형(Type)
 1. RTC/RTC_WAKEUP
    : 세계 표준시를 기준으로 알람 설정, WAKEUP은 장비를 sleep 상태에서 깨움
 2. ELAPSED_REALTIME/ELAPSED_REALTIME_WAKEUP
    : 부팅 후 경과 시간을 기준으로 알람 설정.
    
- 알람 동작
  1. Alarm을 System에 등록
  2. System은 BroadcastReciever로 알람을 방송
  3. 알람을 전달 받은 BR이 액티비티, 서비스, 알림 등 실행
