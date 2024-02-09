# 안드로이드 XML vs Compose 스터디 2024 w/s

이 레포지토리는 개인적으로 진행하는 Android XML과 Compose 스터디를 위한 공간입니다. 

## 스터디 목표

- XML과 Compose의 차이점과 각각의 장단점을 파악합니다.
- 실습을 통해 XML로 레이아웃과 컴포넌트를 구현하고, 이를 Compose로 마이그레이션하는 과정을 기록합니다.

## 스터디 방법

1. 매주 새로운 View 혹은 View Group을 정하고 해당 주제를 XML로 구현합니다.
2. XML로 구현한 주제를 Compose로 마이그레이션합니다.
3. XML과 Compose 통한 주제 구현의 장단점을 마크다운으로 간단하게 정리합니다. 

## 스터디 일정

- **주 1회**: 새로운 주제에 대한 이론 공부 및 간단한 구현, 마이그레이션.

## 브랜치 및 커밋 관리

- 각 주제를 단위로 브랜치를 생성합니다. 브랜치 이름은 `view/주제명` (혹은 `viewgroup/주제명`) 형식을 따릅니다.
- 하나의 토픽 브랜치에서 `view/주제명-xml` 브랜치를 생성하여 해당 브랜치에서 XML 구현 코드를 작성합니다.
- XML 구현이 끝나면 `view/주제명` 브랜치에 Squash And Merge합니다.
- XML 브랜치가 PR이 완료되면 `view/주제명-compose` 브랜치를 생성하여 XML to Compose 마이그레이션을 진행합니다.
- Compose 마이그레이션이 끝나면 `view/주제명-compose` 브랜치를 `view/주제명` 브랜치에 Squash And Merge합니다.
- 작업이 끝난 `view/주제명`은 `main` 브랜치에 PR하는 것이 아니라 유지하도록 합니다.

</br>

- 커밋 메시지는 명확하고 간결하게 작성합니다. 주로 다음과 같은 형식을 따릅니다:
  - `feat: 새로운 기능 추가`
  - `gui: GUI 요소 추가`
  - `fix: 버그 수정`
  - `docs: 문서 업데이트`
  - `refactor: 코드 리팩토링`
  - `test: 테스트 코드 추가/수정`
  - `chore: 빌드 및 설정 파일 업데이트`

예시: `topic/button` `topic/recyclerview-xml`
예시: `git commit -m "gui: design recyclerview with xml"` `"gui: add recyclerview with compose"`

## Pull Request 규칙

- Pull Request를 생성하기 전에 코드를 리뷰하고 자신이 작업한 내용에 대해 확인합니다.
- Pull Request 제목은 간결하고 명확하게 작성하고, 본문에 변경 사항을 자세히 기록합니다.
- 다른 사람이 리뷰할 수 있도록 코드 변경 내용을 명확히 설명합니다.
- 만약 이슈가 있으면 해당 이슈 번호를 제목에 추가합니다.

## 개발 환경
```
Language: Kotlin
IDE: Android Studio Hedgehog
compile SDK: 33
```
---
## 참고 자료

1. Android XML 공식 문서:
   - [XML 레이아웃 소개](https://developer.android.com/guide/topics/ui/declaring-layout)
   - [XML 리소스](https://developer.android.com/guide/topics/resources/providing-resources)
   - [Android XML 소스 코드](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/)

2. Jetpack Compose 공식 문서:
   - [Jetpack Compose 개요](https://developer.android.com/jetpack/compose)
   - [Jetpack Compose 가이드](https://developer.android.com/jetpack/compose/documentation)
   - [Jetpack Compose 샘플](https://github.com/android/compose-samples)

3. XML과 Compose의 차이에 대한 공식 문서:
   - [Compose에서 XML로 마이그레이션 가이드](https://developer.android.com/jetpack/compose/migration)
   - [Android 개발자 사이트의 Compose 블로그](https://android-developers.googleblog.com/search/label/Compose)
   - [Android XML과 Compose 비교 문서](https://developer.android.com/jetpack/compose/mental-model)

