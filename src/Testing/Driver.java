package Testing;

import CubeSolver.Solver;
import RubiksCube.Representation.RubiksCube;
import Scramblers.CrossSolvedScrambler;
import Scramblers.RandomStateScrambler;
import VisualCube.ImageGeneration.Attributes.StageMaskType;
import VisualCube.ImageGeneration.Attributes.VCAttributes;
import VisualCube.ImageGeneration.Generation.VisualCube;

public class Driver {

    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube();
        cube.executeScramble("U2");



        String result = Solver.solve(cube);
        System.out.println(result);



        RandomStateScrambler scrambler = new RandomStateScrambler();
        System.out.println(scrambler.generate());

        CrossSolvedScrambler cScrambler = new CrossSolvedScrambler();
        System.out.println(cScrambler.generate());



        VCAttributes attr = new VCAttributes()
                .algorithmCase("R U R' U'")
                .stageMask(StageMaskType.F2L);

        VisualCube.saveImageWithAttributesToFile(attr, "output/test_image");
    }
}
