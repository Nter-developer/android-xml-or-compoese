# 안드로이드 XML vs Compose 스터디 2024 w/s

이 레포지토리는 Android XML과 Compose 스터디를 위한 공간입니다.

## 스터디 목표

- XML과 Compose의 차이점과 각각의 장단점을 파악합니다.
- 실습을 통해 XML로 레이아웃과 컴포넌트를 구현하고, 이를 Compose로 마이그레이션하는 과정을 기록합니다.

## 스터디 방법

1. 매주 새로운 Components, Layout 혹은 Animation 등의 주제를 정하고 해당 주제를 XML로 구현합니다.
2. XML로 구현한 주제를 Compose로 마이그레이션합니다.
3. XML과 Compose 통한 주제 구현의 장단점을 마크다운으로 간단하게 정리하고 기술 블로그에 포스팅합니다.

## 스터디 일정

- **주 1회 이상**: 새로운 주제에 대한 이론 공부 및 간단한 구현, 마이그레이션을 진행합니다.

## 브랜치 및 커밋 관리

- 각 주제를 단위로 브랜치를 생성합니다. 브랜치 이름은 `분류/주제명` (혹은 `component/button`) 형식을 따릅니다.
- 하나의 토픽 브랜치에서 `분류/주제명-xml` 브랜치를 생성하여 해당 브랜치에서 XML 구현 코드를 작성합니다.
- XML 구현이 끝나면 `분류/주제명` 브랜치에 Squash And Merge합니다.
- XML 브랜치가 PR이 완료되면 `분류/주제명-compose` 브랜치를 생성하여 XML to Compose 마이그레이션을 진행합니다.
- Compose 마이그레이션이 끝나면 `분류/주제명-compose` 브랜치를 `분류/주제명` 브랜치에 Squash And Merge합니다.
- Compose 브랜치가 PR이 완료되면 `분류/주제명-review` 브랜치를 생성합니다.
- `분류/주제명-review` 브랜치에서 리뷰를 작성하고 `분류/주제명` 브랜치에 Squash And Merge합니다.
- 리뷰한 내용을 블로그에 포스팅합니다.
- 작업이 끝난 `분류/주제명`은 `main` 브랜치에 PR하는 것이 아니라 유지하도록 합니다.

</br>

- 커밋 메시지는 명확하고 간결하게 작성합니다. 주로 다음과 같은 형식을 따릅니다:
  - `feat: 새로운 기능 추가`
  - `gui: GUI 요소 추가`
  - `fix: 버그 수정`
  - `docs: 문서 업데이트`
  - `refactor: 코드 리팩토링`
  - `test: 테스트 코드 추가/수정`
  - `chore: 빌드 및 설정 파일 업데이트`

Branch Naming Example: `component/button` `theme/color-dimen-string`   
Git Commit Message Example: `git commit -m "gui: design recyclerview with xml"` `"gui: add recyclerview with compose"`

## Pull Request 규칙

- Pull Request를 생성하기 전에 코드를 리뷰하고 자신이 작업한 내용에 대해 확인합니다.
- Pull Request 제목은 간결하고 명확한 명령문으로 작성합니다.
- Pull Request의 제목은 영어와 한글 상관 없이 작성합니다.
- Pull Request의 제목의 영단어는 모두 대문자로 시작하도록 합니다.
- 다른 사람이 리뷰할 수 있도록 코드 변경 내용을 명확히 설명합니다.
- 만약 이슈가 있으면 해당 이슈 번호를 제목에 추가합니다.
- 학습 내용과 리뷰는 `xml`과 `compose`이 아닌 `review` 이슈와 pull request에 작성합니다.

예시: `[xml] Recycler view를 구현한다`

## 개발 환경
```
Language: Kotlin
IDE: Android Studio Hedgehog
compile SDK: 33
```

---
## 참고 자료

1. Android XML 공식 문서:
- Android Developer [XML 레이아웃 소개](https://developer.android.com/guide/topics/ui/declaring-layout)
- Android Developer [XML 리소스](https://developer.android.com/guide/topics/resources/providing-resources)
- Android Developer [Android XML 소스 코드](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/)

2. Jetpack Compose 공식 문서:
- Android Developer [Jetpack Compose 개요](https://developer.android.com/jetpack/compose)
- Android Developer [Jetpack Compose 가이드](https://developer.android.com/jetpack/compose/documentation)
- Android GitHub [Jetpack Compose 샘플](https://github.com/android/compose-samples)
- Android Developer [Jetpack Compose API의 스타일 가이드라인](https://developer.android.com/jetpack/compose/api-guidelines?hl=ko)

3. XML과 Compose의 차이에 대한 공식 문서:
- Android Developer [Compose에서 XML로 마이그레이션 가이드](https://developer.android.com/jetpack/compose/migration)
- Android Developers Blog [Android 개발자 사이트의 Compose 블로그](https://android-developers.googleblog.com/search/label/Compose)
- Android Developer [Android XML과 Compose 비교 문서](https://developer.android.com/jetpack/compose/mental-model)

