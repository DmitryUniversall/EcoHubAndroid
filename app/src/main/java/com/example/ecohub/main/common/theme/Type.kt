package com.example.ecohub.main.common.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.ecohub.R


val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

private val MontserratFont = GoogleFont("Montserrat")
private val AppFontFamily = FontFamily(
    Font(googleFont = MontserratFont, fontProvider = provider),
    Font(googleFont = MontserratFont, fontProvider = provider, weight = FontWeight.Bold),
    Font(googleFont = MontserratFont, fontProvider = provider, weight = FontWeight.Medium),
    Font(googleFont = MontserratFont, fontProvider = provider, weight = FontWeight.SemiBold),
)

val AppTypography = Typography(
    displayLarge = TextStyle(                   // 32sp Bold
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 36.sp
    ), // Use for very prominent numbers/hero titles (e.g., large product price in hero)
    displayMedium = TextStyle(                  // 28sp Bold
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 32.sp
    ), // Use for main screen title or product name in prominent area ("Red Apple" if large)
    displaySmall = TextStyle(                   // 24sp SemiBold
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 28.sp
    ), // Use for secondary large headings (e.g., section headings when stronger)
    headlineLarge = TextStyle(                  // 22sp Medium
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 26.sp
    ), // Use for product name in header area (left column "Red Apple" in screenshot)
    headlineMedium = TextStyle(                 // 18sp Medium
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 22.sp
    ), // Use for section titles like "Description", "More Fruits", "Review"
    bodyLarge = TextStyle(                      // 16sp Regular
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp
    ), // Use for normal body text (description preview lines)
    bodyMedium = TextStyle(                     // 14sp Regular
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 18.sp
    ), // Use for slightly smaller body / review text, snippet text in cards
    labelSmall = TextStyle(                     // 12sp Regular
        fontFamily = AppFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ) // Use for metadata (dates like "4th Jan 2024"), small labels, captions
)
