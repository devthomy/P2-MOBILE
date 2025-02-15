package org.mathieu.sandboxdiiage12027.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.mathieu.sandboxdiiage12027.R
import org.mathieu.sandboxdiiage12027.ui.theme.*

@Composable
fun BottomNavBar() {
    // Couleurs et styles de base
    val navBarColor = Color.Black // Fond noir de la navbar
    val iconColor = Color.Gray // Couleur des icônes inactives
    val homeButtonSize = 60.dp // Taille du bouton maison central

    // Conteneur principal
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(navBarColor),
        contentAlignment = Alignment.TopCenter
    ) {
        // Barre de navigation classique (sans le bouton maison)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icône gauche (couronne)
            Icon(
                painter = painterResource(id = R.drawable.icon_crown), // Change selon ton fichier d'icône
                contentDescription = "Crown Icon",
                tint = iconColor,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(homeButtonSize)) // La place pour le bouton central

            // Icône droite (avatar)
            Icon(
                painter = painterResource(id = R.drawable.ic_user), // Change selon ton fichier d'icône
                contentDescription = "User Icon",
                tint = iconColor,
                modifier = Modifier.size(24.dp)
            )
        }

        // Bouton maison central
        Surface(
            color = navBarColor,
            shape = CircleShape,
            modifier = Modifier
                .size(homeButtonSize)
                .align(Alignment.Center)
                .offset(y = -20.dp), // Décalage vers le haut pour ressortir
            shadowElevation = 4.dp // Ombre pour le bouton maison
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(navBarColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_home), // Change selon ton fichier d'icône
                    contentDescription = "Home Icon",
                    tint = Color.White, // Couleur de la maison
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}